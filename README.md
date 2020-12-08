# Introducción 
*Los chicos de BK están aprendiendo a hacer componente Java usando el IDE NetBeans. Ahora están intentando realizar un planificador que ejecute una determinada aplicación a una fecha y hora previamente configurada. Para ello, necesitaremos tener los siguientes elementos:
Apellido1_Apellido2_Nombre_DI03_Tarea:.Será nuestra aplicación que tiene el main e integra el componente que debemos desarrollar.*

# Enunciado
-	**FechaHoraDigital:** Se trata de un componente que podremos integrar en cualquier programa. Este componente lo podrás desarrollar con las clases que necesites, pero deberá tener las siguientes características:
   - **Fecha y Hora:** En un JLabel nos debe aparecer un reloj donde aparecerá la fecha y hora en el formato dd/MM/yyyy HH:mm:ss que deberá actualizarse cada segundo. Este componente tendrá propiedad booleana para indicar si el formato es de 12 o 24 horas.
   - **Fecha Planificada:** Se trata de un campo de tipo JCalendar, donde se definirá una fecha y hora a la que queremos que se ejecute una determinada aplicación. El formato será el mismo que el del reloj dd/MM/yyyy HH:mm:ss
   - **Ejecutable:** Se trata de un campo donde se podrá seleccionar una determinada aplicación del equipo, la cual se abrirá cuando se cumpla la fecha y hora de planificación. En este caso podremos utilizar una propiedad donde se podrá especificar la ruta, o a través del propio programa. En cualquier caso, nos debe aparecer un cuadro de diálogo donde se pueda localizar el fichero dentro de nuestro equipo. Para las pruebas podréis utilizar la calculadora de Windows, calc.exe.
   - **Cargado:** Se trata de una etiqueta que utilizaremos de estado.
      - **NO CARGADO** (y con fondo rojo). Al arrancar el programa aparecerá como NO CARGADO y con color rojo que significa que debemos establecer una configuración inicial en los campos Fecha Planificada y Ejecutable.
      - **CARGADO** (y con fondo naranja). Significa que se ha cargado, pero no se ha ejecutado porque no ha llegado la fecha y hora establecida.
      - **EJECUTADO** (y con fondo verde). Significa que ha llegado la fecha y hora de la Fecha Planificada y se ha abierto automáticamente nuestra aplicación. Una vez realizada la ejecución el programa nos permitirá realizar nuevas configuraciones cambiando los estados de EJECUTADO a CARGADO.
     - **Botón de Cargar:** Es el botón que nos permitirá cambiar los estados. De manera que, si he configurado tanto la Fecha Planificada y el Ejecutable, pulsaremos el botón y cambiaremos de estado a CARGADO.
- **Mensaje:** Se trata de una etiqueta que utilizaremos como mensajes de lo que tenemos configurado en cada momento. Debe tener el mismo color de fondo que tengamos en la etiqueta estado. Por ejemplo, al inicio del programa configuraremos un mensaje de que debe introducir la Fecha de Planificación y el Ejecutable. Cuando se cargue el programa nos aparecerá que la aplicación X se ejecutará a la fecha planificada Y. Y cuando llegue la ejecución automática porque se haya cumplido la hora nos aparecerá un mensaje de que la última ejecución de la aplicación X se ha realizado a la fecha y hora Y.

