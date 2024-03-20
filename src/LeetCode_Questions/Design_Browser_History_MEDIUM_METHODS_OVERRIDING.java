package LeetCode_Questions;

public class Design_Browser_History_MEDIUM_METHODS_OVERRIDING
{
    class BrowserHistory
    {
        public class ListNode {
            String val;
            ListNode next;
            ListNode prev;
            ListNode() {}
            ListNode(String val)
            {
                this.val = val;
                this.prev = null;
                this.next = null;
            }
            //   ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }

        ListNode temp;

        public BrowserHistory(String homepage) {
            ListNode home = new ListNode(homepage);
            // temp.next = home;
            home.prev = null;

            temp = home;
        }

        public void visit(String url)
        {
            ListNode home = new ListNode(url);
            temp.next = home;
            home.prev = temp;

            temp = home;
        }

        public String back(int steps) {
            for(int i=1;i<=steps;i++)
            {
                if(temp.prev == null)
                    return temp.val;

                temp = temp.prev;
            }
            return temp.val;
        }

        public String forward(int steps) {
            for(int i=1;i<=steps;i++)
            {
                if(temp.next == null)
                    return temp.val;

                temp = temp.next;
            }
            return temp.val;
        }
    }

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
}
