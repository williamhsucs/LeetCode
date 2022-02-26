class WordBreak {
  private Set<String> wrongRecord = new HashSet<>();

  public boolean wordBreak(String target, List<String> wordDict) {
    if (target == null || target.length() == 0) return false;
    return dfs(target, wordDict);
  }

  public boolean dfs(String target, List<String> wordDict) {
    if (target.length() == 0) return true;
    if (wrongRecord.contains(target)) return false;
    for (String word : wordDict) {
      if (target.startsWith(word)) {
        if (dfs(target.substring(word.length()), wordDict)) return true;
      }
    }
    wrongRecord.add(target);
    return false;
  }

}