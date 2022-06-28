#  Savannah Quiz

Reto que corresponde al mes de marzo de la serie de deasfios que esta proponiendo Mouredev en su proyecto de retos de creación mensual de aplicaciones de la comunidad MoureDev en base a requisitos, llamdado App Monthly Challenge 2022.
Requisitos para la app de marzo

CUESTIONARIO CONTRARRELOJ: Crea una "Quiz app" contrareloj con ranking.

Requisitos:

   -* El diseño es de libre elección.
  -  La temática de las preguntas del cuestionario será de libre elección. Puede estar bien seguir un mismo tema (por ejemplo, preguntas sobre el universo "Harry Potter").
  -  En la pantalla inicial podrás comenzar a jugar o consultar el ranking de puntuaciones.
  -  El juego consistirá en 10 preguntas aleatorias con 3 respuestas y sólo una correcta. Recomendable crear más de 10 preguntas para que no siempre salgan las mismas. Cada vez que se responde a una pregunta, se pasará a la siguiente.
-    Disponemos de 30 segundos para responder cada pregunta. El contador deberá aparecer en la pantalla, y si llega a 0 se tomará como respuesta incorrecta y se pasará a la siguiente pregunta.
 -   Al marcar una respuesta o finalizar el tiempo, se mostrará si se ha acertado o no la pregunta, dando feedback sobre cuál sería la respuesta correcta y navegando al cabo de un par de segundos a la siguiente pantalla.
 -   Sistema de puntuación:
        Contador a 0 o respuesta incorrecta = 0 puntos.
        Contador mayor 0 y respuesta correcta = [segundos restantes] puntos. Ej: Si quedaban 9 segundos para finalizar la cuenta atrás y se acierta la pregunta, se asignan 9 puntos.
 -   Una vez finalizada la pregunta número 10 se mostrará en una nueva pantalla la puntuación final y se deberá introducir un nombre para guardarla de forma persistente (aunque cerremos la app). Hecho estos se mostrará la pantalla de ranking.
-    La pantalla de ranking muestra ordenados de mayor a menor los 10 mejores resultados y el nombre guardado. Desde esta pantalla siempre se podrá navegar a la pantalla inicial.


Solución del reto

# WelcomeScreen

![WelcomeScreen](https://user-images.githubusercontent.com/73857138/176320379-51a0006c-cdea-4d29-8008-5f43db94f40f.jpg)




# Quiz Screen
![QuizScreen](https://user-images.githubusercontent.com/73857138/176320400-e87e7c1b-6ed0-4609-93e6-57c565da5375.jpg)




# Score Screen
![ScoreScreen](https://user-images.githubusercontent.com/73857138/176320413-bf99bb05-795f-44b5-a597-11f88e7dbfc1.jpg)



### Tecnologies: 
 


<p>
<a href="https://kotlinlang.org/" target="_blank">Kotlin</a>
 </p>
 <p>
<a href="https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93viewmodel" target="_blank">MVVM</a>
 </p>
 <p>
<a href="https://developer.android.com/jetpack/compose?hl=es-419" target="_blank">Jetpack Compose</a>
 </p>
 <p >
<a href="https://dagger.dev/hilt/" target="_blank">Dagger Hilt</a>
 </p>
 <p >
<a href="https://square.github.io/retrofit/" target="_blank">Room</a>
 </p>
 <p>
<a href="https://developer.android.com/kotlin/coroutines?hl=es-419" target="_blank">Coroutines</a>
 </p>

