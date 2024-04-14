//package com.example.myapplication.flows
//
//import android.util.Log
//import androidx.lifecycle.ViewModel
//import kotlinx.coroutines.delay
//import kotlinx.coroutines.flow.MutableStateFlow
//import kotlinx.coroutines.flow.asFlow
//import kotlinx.coroutines.flow.asStateFlow
//import kotlinx.coroutines.flow.combine
//import kotlinx.coroutines.flow.launchIn
//import kotlinx.coroutines.flow.merge
//import kotlinx.coroutines.flow.onEach
//import kotlinx.coroutines.flow.update
//import kotlinx.coroutines.flow.zip
//
//data class User(
//    val userName: String? = null,
//    val description: String? = null,
//)
//
//data class Post(
//    val post: String? = null,
//    val date: String? = null
//)
//
//data class ProfileState(
//    val userName: String? = null,
//    val description: String? = null,
//    val post: List<Post> = emptyList(),
//)
//class flowOperatorsViewModel: ViewModel() {
//
//    private val isAuthenticated = MutableStateFlow(true)
//    private val user = MutableStateFlow<User?>(null)
//    private val posts = MutableStateFlow(emptyList<Post>())
//
//    private val _profileState = MutableStateFlow<ProfileState?>(null)
//    val profileState = _profileState.asStateFlow()
//
//    val flow1 = (0 until 10).asFlow().onEach { delay(10000L) }
//    val flow2 = (10 until 100).asFlow().onEach { delay(300L) }
//    val flow3 = (100 until 300).asFlow().onEach { delay(300L) }
//    var numberString by mutableStateOf("")
//        private set
//    init {
//        /// it will be triger when either one of the flows change and is gonna modiffy
//        /// the specific value
//        isAuthenticated.combine(user){ isAuthenticated, user ->
//            if (isAuthenticated) user else null
//        }.combine(posts){ user, posts ->
//            user?.let {
//                _profileState.value = profileState.value?.copy(
//                    userName = it.userName,
//                    description = it.description,
//                    post = posts
//                )
//
//            } ?: Log.d("flowOperatorsViewModel", "user not authenticated")
//
//        }.launchIn(viewmodelScope)
//
//        /// zip will be trigger when both flows send an new value it doesnt matter
//        // if there is a delay between flows
//        flow1.zip(flow2) { number1, number2 ->
//            numberString += "($number1, $number2)\n"
//
//        }.launchIn(viewmodelScope)
//
//
//        /// it will send both flows in a single emition
//        merge(flow1,flow2, flow3).onEach {
//            numberString += "$it\n"
//        }.launchIn(viewmodelScope)
//    }
//
//
//}