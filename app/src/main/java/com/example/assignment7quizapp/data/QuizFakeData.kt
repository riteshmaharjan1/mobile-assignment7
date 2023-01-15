package com.example.assignment7quizapp.data

import com.example.assignment7quizapp.constants.Constant.IS_CHECK_BOX
import com.example.assignment7quizapp.constants.Constant.IS_RADIO_BUTTON
class QuizFakeData {

    companion object {
        fun getQuizQuestions(): MutableList<Quiz> {
            return mutableListOf(
                Quiz(
                    1,
                    "1. Is it possible to have an activity without UI to perform action/actions?",
                    IS_RADIO_BUTTON,
                    "Generally, every activity is having its UI(Layout). But if a developer wants to create an activity without UI, he can do it.",
                    "c",
                    "Yes, it is possible",
                    "",
                    "",
                    mutableListOf("Not possible","Wrong question", "Yes, it is possible", "None of the above")
                ),
                Quiz(
                    2,
                    "2. What is JNI in android?",
                    IS_RADIO_BUTTON,
                    "Java Native interfaces are used to call native/cross applications, which are written in C and C++ languages.",
                    "d",
                    "Java native interface.",
                    "",
                    "",
                    mutableListOf("Java network interface","Java interface","Image editable tool","Java native interface.")
                ),
                Quiz(
                    3,
                    "3. How many ports are allocated for new emulator?",
                    IS_RADIO_BUTTON,
                    "Every emulator or device is allocated by 2 ports based on port availability.",
                    "a",
                    "2",
                    "",
                    "",
                    mutableListOf("2","0","10","None of the above.")
                ),
                Quiz(
                    4,
                    "4. What does httpclient.execute() returns in android?",
                    IS_RADIO_BUTTON,
                    "Httpclient.execute() executes only once and it will return http response from the server or device, Http entity is embedded the body of the Http response.",
                    "b",
                    "Http response",
                    "",
                    "",
                    mutableListOf("Http entity","Http response","Http result","None of the above")
                ),
                Quiz(
                    5,
                    "5. Fragment in Android can be found through",
                    IS_RADIO_BUTTON,
                    "Using FragmentManager.findFragmentByID(R.id.fragment), we can find the fragment/fragments which are placed on the layout",
                    "d",
                    "FragmentManager.findFragmentByID()",
                    "",
                    "",
                    mutableListOf("findByID()","findFragmentByID()","getContext.findFragmentByID()","FragmentManager.findFragmentByID()")
                ),
                Quiz(
                    6,
                    "6. APK stands for _____",
                    IS_RADIO_BUTTON,
                    "An APK is a short form of the Android Package Kit. An APK file is the file format used to install the applications on the android operating system.",
                    "c",
                    "Android Package Kit",
                    "",
                    "",
                    mutableListOf("Android Phone Kit","Android Page Kit","Android Package Kit")
                ),
                Quiz(
                    7,
                    "7. Can a class be immutable in android?",
                    IS_RADIO_BUTTON,
                    "Class can be immutable.",
                    "b",
                    "Yes, Class can be immutable",
                    "",
                    "",
                    mutableListOf("No, it can't","Yes, Class can be immutable","Can't make the class as final class", "None of the above")
                ),
                Quiz(
                    8,
                    "8. How can we kill an activity in android?",
                    IS_CHECK_BOX,
                    "The finish() method is used to close the activity. Whereas the finishActivity(int requestCode) also closes the activity with requestCode.",
                    "ab",
                    "Using finish() method\nUsing finishActivity(int requestCode)",
                    "",
                    "",
                    mutableListOf("Using finish() method","Using finishActivity(int requestCode)","Neither (a) nor (b)")
                ),
                Quiz(
                    9,
                    "9. On which of the following, developers can test the application, during developing the android applications?",
                    IS_CHECK_BOX,
                    "We can use the Android emulator, physical android phone, or third-party emulator as a target device to execute and test our Android application.",
                    "abc",
                    "Third-party emulators\nEmulator included in Android SDK\nPhysical android phone",
                    "",
                    "",
                    mutableListOf("Third-party emulators","Emulator included in Android SDK","Physical android phone")
                ),
                Quiz(
                    10,
                    "10. What are return types of startActivityForResult() in android?",
                    IS_RADIO_BUTTON,
                    "strartActivityforResult() returns RESULT_OK and RESULT_CANCEL.",
                    "d",
                    "A & B",
                    "",
                    "",
                    mutableListOf("RESULT_OK","RESULT_CANCEL","RESULT_CRASH","A & B")
                ),
                Quiz(
                    11,
                    "11. Which of the following is a dialog class in android?",
                    IS_CHECK_BOX,
                    "All of the above are Dialog classes",
                    "abc",
                    "AlertDialog\nDatePicker Dialog\nProgressDialog",
                    "",
                    "",
                    mutableListOf("AlertDialog","DatePicker Dialog","ProgressDialog")
                ),
                Quiz(
                    12,
                    "12. Which of the following android component displays the part of an activity on screen?",
                    IS_RADIO_BUTTON,
                    "Android Fragment is the part of activity; it is also known as sub-activity. There can be more than one fragment in an activity. Fragments represent multiple screens inside one activity.",
                    "d",
                    "Fragment",
                    "",
                    "",
                    mutableListOf("View","Manifest","Gradle","Fragment")
                ),
                Quiz(
                    13,
                    "13. Which of the following is the parent class of Activity?",
                    IS_RADIO_BUTTON,
                    "The android Activity is the subclass of ContextThemeWrapper class. Android Activity Lifecycle is controlled by 7 methods of android.app.Activity class. An activity is a single screen in android. It is like a window or frame of Java.",
                    "c",
                    "contextThemeWrapper",
                    "",
                    "",
                    mutableListOf("context","object","contextThemeWrapper","None of the above")
                ),
                Quiz(
                    14,
                    "14. Which of the following features are updated in Android 4.1(Jelly Bean)?",
                    IS_CHECK_BOX,
                    "Android 4.1(Jelly Bean) updates to following features: smoother user interface, enhance accessibility, expandable notification, fixed bug on Nexus 7, one-finger gestures to expand/collapse notifications, lock screen improvement, multiple user accounts (tablets only), new clock application, Bluetooth low energy support, volume for incoming call, 4K resolution support, native emoji support, bug fixes for the Nexus 7 LTE.",
                    "abc",
                    "User Interface\nLock screen improvement\nNew clock application",
                    "",
                    "",
                    mutableListOf("User Interface","Lock screen improvement","New clock application")
                ),
                Quiz(
                    15,
                    "15. Which of the following method is used by services to clean up any services?",
                    IS_RADIO_BUTTON,
                    "The onDestroy() method can be used by services to clean up any resources like receivers, threads, registered listeners, etc.",
                    "c",
                    "onDestroy() method",
                    "",
                    "",
                    mutableListOf("onStop() method","stopService() method","onDestroy() method","stopSelf() method")
                )
            )
        }
    }
}