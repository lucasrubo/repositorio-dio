------------------------------------
|           iPhone                   |
------------------------------------
| - player: ReprodutorMusical       |
| - phone: AparelhoTelefonico       |
| - browser: NavegadorInternet      |
------------------------------------
| + iPhone()                         |
| + playMusic()                     |
| + pauseMusic()                    |
| + selectMusic()                   |
| + call()                          |
| + answerCall()                    |
| + startVoiceMail()                |
| + displayWebPage()                |
| + addNewTab()                     |
| + refreshPage()                   |
------------------------------------

Interface ReprodutorMusical
--------------------
+ play()
+ pause()
+ selectMusic()

Interface AparelhoTelefonico
--------------------
+ call()
+ answerCall()
+ startVoiceMail()

Interface NavegadorInternet
--------------------
+ displayWebPage()
+ addNewTab()
+ refreshPage()
