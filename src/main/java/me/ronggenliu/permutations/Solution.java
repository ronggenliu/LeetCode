package me.ronggenliu.permutations;

import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Gary Liu on 2018/11/13.
 */
public class Solution {
  public static void main(String[] args) throws IOException {
    if (args.length < 1) {
      return;
    }
    String filePath = args[0];
    Solution solution = new Solution();
    String formula = solution.getFormula(filePath);
    if (null == formula) {
      return;
    }
    List<String> result = solution.matchFormula(formula);
    for (String item : result) {
      out.println(item);
    }
  }

  private List<String> matchFormula(String formula) {
    return permute(new Formula(formula));
  }

  private List<String> permute(Formula formula) {
    List<String> list = new ArrayList<>();
    boolean[] used = new boolean[formula.numbers.length];
    backtrack(list, new ArrayList<>(), used, formula);
    return list;
  }

  private void backtrack(List<String> list, List<Integer> tempList, boolean[] used,
                         Formula formula) {
    if (tempList.size() == formula.charSet.size()) {
      String matcher = formula.matchFormula(tempList);
      if (null != matcher) {
        list.add(matcher);
      }
    } else {
      for (int i = 0; i < formula.numbers.length; i++) {
        if (used[i]) continue;
        tempList.add(formula.numbers[i]);
        used[i] = true;
        backtrack(list, tempList, used, formula);
        tempList.remove(tempList.size() - 1);
        used[i] = false;
      }
    }
  }

  private String getFormula(String filePath) throws IOException {
    File formulaFile = new File(filePath);
    try (FileReader fileInputStream = new FileReader(formulaFile)) {
      try (BufferedReader bufferedReader = new BufferedReader(fileInputStream)) {
        String line = bufferedReader.readLine().trim();
        if (!line.isEmpty()) {
          return line;
        }
      }
    }
    return null;
  }

  class Formula {
    private String formulaStr;
    private String leftVal;
    private String rightVal;
    private String equalVal;
    private int[] numbers;
    private LinkedHashSet<Character> charSet;

    Formula(String formula) {
      this.formulaStr = formula;
      int multipleInd = formula.indexOf('*');
      int equalInd = formula.indexOf('=');
      leftVal = formula.substring(0, multipleInd).trim();
      rightVal = formula.substring(multipleInd + 1, equalInd).trim();
      equalVal = formula.substring(equalInd + 1).trim();
      numbers = IntStream.range(0, 10).toArray();
      List<Character> characters = formula.replaceAll("[^a-z^A-Z]", "").chars().mapToObj(e -> (char) e)
          .collect
              (Collectors
                  .toList());
      charSet = new LinkedHashSet<>(characters);
    }

    String matchFormula(List<Integer> permutation) {
      String leftValTemp = leftVal;
      String rightValTemp = rightVal;
      String equalValTemp = equalVal;
      String formulaTemp = formulaStr;
      int i = 0;
      for (Character character : charSet) {
        leftValTemp = leftValTemp.replaceAll(character + "", permutation.get(i) + "");
        rightValTemp = rightValTemp.replaceAll(character + "", permutation.get(i) + "");
        equalValTemp = equalValTemp.replaceAll(character + "", permutation.get(i) + "");
        i++;
      }
      int leftTotal = Integer.parseInt(leftValTemp) * Integer.parseInt(rightValTemp);
      if (leftTotal == Integer.parseInt(equalValTemp) && !leftValTemp.startsWith("0") && !rightValTemp.startsWith("0")
          && !equalValTemp.startsWith("0")) {
        formulaTemp = formulaTemp.replace(leftVal, leftValTemp);
        formulaTemp = formulaTemp.replace(rightVal, rightValTemp);
        formulaTemp = formulaTemp.replace(equalVal, equalValTemp);
        return formulaTemp;
      }
      return null;
    }
  }
}