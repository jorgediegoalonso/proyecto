# proyecto

### Lombok

- 29/4/2022 - 2/5/2022
  - Instalación de lombok
  - Var
  - Val
  - Anotación NonNull (No permite pasar un null como parametro)
  - Anotación Cleanup (cerrar por ejemplo flujos de texto al dejar de utilizarlo)
  
- 7/5/2022 - 8/5/2022
  - Practica Final curso 1 de lombok  
  - Anotación Getter (Crea los getter)
  - Anotación Getter Lazy (crea el getter y guarda en cache el dato)
  - Anotación Setter (Crea los setter)
  - Anotación With (crea el metodo with para recrear el objeto para poder cambiar una constante)
  - Anotación tostring (Crea un to string al objeto que te mostrara todas la propiedades por defecto)
- 13/5/2022 - 16/5/2022
  - Practica final curso 2 de lombok
  - Anotación Builder (Podremos usar un builder para hacer mas comoda la creación del objeto y solo asignar las propiedades que queremos, las demas se inicializaran                             a (0,false o cadena vacia))
  - Anotación EqualsAndHashCode (Crea los metodos equals y hashCode del objeto)
  - Anotación NoArgsConstructor (Crea un constructor sin parametros)
  - Anotación RequiredArgsConstructor (crea un constructor que tendra como parametros para inicializar las propiedades @nonNull y final)
  - Anotación AllArgsConstructor (crea un constructor que inicializara por parametros las propiedades no estaticas)
  - Anotación Data (Lo mismo a usar sobre la clase RequiredArgsContructor+setter+getter+EqualsAndHashCode+tostring)
  - Anotación Value (Sería como Data pero no genera setters de las propiedades y en lugar de usar RequiredArgsContructor, usa AllArgsConstructor por lo que la idea es inicializar todo con el constructor)
  - Anotación SkeakyThrows (Lanza excepciones sin necesidad de try catch ni throws en el metodo. Para mi con lo despistado que soy no creo que me ayude mucho porque a lo mejor despues no encuentre bien donde estoy lanzando la excepción)
  - Anotación Synchronized (Se podría decir que sustituye al synchronized de java)
  - Anotación log
    - commonsLog  
    - JbossLog
    - Log4j
    - Log 
    - Slf4j
    - Xslf4j
  - Configuración de los logs y archivo de configuración
  - Anotaciones Experimentales  
- ### Opinion  

  En mi opinión me ha parecido una carrera útil, claramente algunas anotaciones me parecieron mejores que otras o que tenían un uso mas general.
  Las mejores para mi fueron generalmente las de contructores y @Data ya que me parece que serían las que utilizaría normalmente.
  En cuanto a las clases pienso que fueron fáciles de entender y seguir ademas el profesor se esforzaba para que fuera asi. 
  
### Fundamentos ITIL 4
  - 17/5/2022 - 18/5/2022
    - Primer curso: Conceptos basicos de ITIL (Relación proveedor y consumidor, tipos de proveedores, salidas, resultados, garantía, oferta de servicio, etc.)
    - Segundo curso: Explicación y aplicación practica de los Principios Guía (Centrarse en el valor, Comenzar desde esté, Progresar iterativamente y con retroalimentación, Colaborar y promover la visibilidad, Pensar y trabajar de forma holística, Mantenerlo simple y práctico, Optimizar y automatizar)
  - 21/5/2022 - 23/5/2022
    - Tercer curso: Explicación Cuatro dimensiones de la Gestión de servicios (Organizaciones y personas, Información y tecnología, Socios y proveedores, Flujos de valor y procesos)
    - Cuarto curso: Explicación del sistema de valor del Servicio(Componentes del SVS y su integración, La mejora continua, modelo de mejora continua ,cadena de valor del servicio)
    - Quinto curso: Taller de creación de un flujo de valor para entender la utilidad práctica de lo aprendido anteriormente, su uso y prácticas ITIL que se aplican
    - Sexto Curso: Introducción a las practicas (practicas de gestión, Mejora continua, Habilitación de cambios y gestión de incidentes)
    - Séptimo Curso: Ampliando practicas de ITIL (Gestión de problemas, Gestión de solicitudes de servicio, Mesa de servicio,  Gestión de niveles de servicio)
