#include <iostream>
#include <vector>
#include <queue>

using namespace std;

struct ListNode
{
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};

struct compare
{
    bool operator()(ListNode *a, ListNode *b)
    {
        return a->val > b->val;
    }
};

ListNode* merge_k_lists(vector<ListNode *> &lists)
{
    priority_queue<ListNode *, vector<ListNode *>, compare> pq;
    for (ListNode *list : lists)
    {
        if (list != NULL)
        {
            pq.push(list);
        }
    }

    ListNode *dummy = new ListNode(0);
    ListNode *current = dummy;

    while (!pq.empty())
    {
        ListNode *node = pq.top();
        pq.pop();
        current->next = node;
        current = current->next;
        if (node->next != NULL)
        {
            pq.push(node->next);
        }
    }

    return dummy->next;
}

void print_list(ListNode* list) {
    while(list != NULL) {
        cout << list->val << " ";
        list = list->next;
    }
    cout << endl;
}

int main()
{
    vector<ListNode *> lists = {new ListNode(1), new ListNode(1), new ListNode(2)};
    lists[0]->next = new ListNode(4);
    lists[0]->next->next = new ListNode(5);
    lists[1]->next = new ListNode(3);
    lists[1]->next->next = new ListNode(4);
    lists[2]->next = new ListNode(6);

    ListNode* head = merge_k_lists(lists);
    print_list(head);

    return 0;
}