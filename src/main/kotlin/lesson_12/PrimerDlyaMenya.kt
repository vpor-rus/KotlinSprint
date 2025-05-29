package org.example.lesson_12

class Forum(
    var userIdCounter: Int = 0,
    var userNameList: MutableList<MemberForum> = mutableListOf(),


    ) {
    fun createNewUser(
        username: String,

        ): MemberForum {
        val createMemberInForum = MemberForum(
            userName = username,
            userId = userIdCounter,
        )
        userNameList.add(createMemberInForum)
        userIdCounter++
        return createMemberInForum
    }

    class MemberForum(
        userName: String,
        userId: Int,
    )
}