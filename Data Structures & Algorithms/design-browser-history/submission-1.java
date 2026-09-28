class BrowserHistory {
    List<String> list = new ArrayList();
    private int position = 0;

    public BrowserHistory(String homepage) {
        this.list.add(homepage);
    }
    
    public void visit(String url) {
        this.list.subList(position + 1, this.list.size()).clear();
        this.list.add(url);
        this.position += 1;
    }
    
    public String back(int steps) {
        int index = Math.max(0, position - steps);
        this.position = index;
        return list.get(index);
    }
    
    public String forward(int steps) {
        int index = Math.min(this.list.size() - 1, steps + this.position);

        this.position = index;
        return this.list.get(this.position);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */