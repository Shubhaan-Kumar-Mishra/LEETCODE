class TimeMap {

    private class Node {
        int timestamp;
        String key;
        String value;
        Node next;
        Node prev;

        Node(int timestamp, String key, String value) {
            this.timestamp = timestamp;
            this.key = key;
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }

    private Node list;

    public TimeMap() {
        list = null;
    }
    
    public void set(String key, String value, int timestamp) {
        if (list == null) {
            list = new Node(timestamp, key, value);
        } else {

            Node node = new Node(timestamp, key, value);
            node.next = list;
            list.prev = node;
            list = node;
        }
    }
    
    public String get(String key, int timestamp) {
        Node cur = list;

        while (cur != null) {
            if (cur.key.equals(key) && timestamp >= cur.timestamp) {
                return cur.value;
            }
            cur = cur.next;
        }
        return "";
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */