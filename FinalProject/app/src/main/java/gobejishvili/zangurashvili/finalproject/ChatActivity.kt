package gobejishvili.zangurashvili.finalproject

import adapter.ChatAdapter
import android.os.Bundle
import android.text.InputFilter
import android.text.Spanned
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import entity.Chat
import java.util.*

class ChatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)
        var chatView = findViewById<RecyclerView>(R.id.chat_recycler_view)
        chatView.layoutManager = LinearLayoutManager(this)

        val chatList = mutableListOf<Chat>()


        val firstChat = Chat(1, 2, "დსჯჯჯჯჯჯჯჯჯჯჯჯჯჯჯჯჯჯჯჯჯჯჯლსაფჰ,ჯდსფკჯდსლკჯდსჰგლკფდაჰგფდსგლკჯჰფდსგკჯდწადფნლკჯდსაჰფლკჯდსაჰფლკჯდსაჰფლკჯდსაჰფკდსაჰფ", Calendar.getInstance().getTime())
        val secondChat = Chat(2, 1, "ჯდსფკჯდსლკჯდსჰგლკფდაჰგფდსგლკჯჰფდსგკჯდწადფნლკჯდსაჰფლკჯდსაჰფლკჯდსაჰფლკჯდსაჰფკდსაჰფსჯდლკსადსადსად", Calendar.getInstance().getTime())


        chatList.add(firstChat)
        chatList.add(firstChat)
        chatList.add(secondChat)
        chatList.add(secondChat)
        chatList.add(secondChat)
        chatList.add(firstChat)
        chatList.add(firstChat)
        chatList.add(secondChat)
        chatList.add(firstChat)
        chatList.add(secondChat)
        chatList.add(firstChat)
        chatList.add(firstChat)
        chatList.add(secondChat)
        chatList.add(secondChat)
        chatList.add(secondChat)
        chatList.add(firstChat)
        chatList.add(firstChat)
        chatList.add(secondChat)
        chatList.add(firstChat)
        chatList.add(secondChat)

        val chatAdapter = ChatAdapter(chatList, 1)

        chatView.adapter = chatAdapter


    }
}


