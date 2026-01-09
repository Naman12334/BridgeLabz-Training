class FriendNode {
    int id;
    FriendNode next;

    FriendNode(int i) { id = i; }
}

class UserNode {
    int id, age;
    String name;
    FriendNode friends;
    UserNode next;
}
