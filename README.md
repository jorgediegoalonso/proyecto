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
- 13/5/2022 - 15/5/2022
  - Practica final curso 2 de lombok
  - Anotación Builder (Podremos usar un builder para hacer mas comoda la creación del objeto y solo asignar las propiedades que queremos, las demas se inicializaran                             a (0,false o cadena vacia))
  - Anotación EqualsAndHashCode (Crea los metodos equals y hashCode del objeto)
  - Anotación NoArgsConstructor (Crea un constructor sin parametros)
  - Anotación RequiredArgsConstructor (crea un constructor que tendra como parametros para inicializar las propiedades @nonNull y final)
  - Anotación AllArgsConstructor (crea un constructor que inicializara por parametros las propiedades no estaticas)
  - Anotación Data (Lo mismo a usar sobre la clase RequiredArgsContructor+setter+getter+EqualsAndHashCode+tostring)
  - Anotación Value (Sería como Data pero no genera setters de las propiedades y en lugar de usar RequiredArgsContructor, usa AllArgsConstructor por lo que la idea es inicializar todo con el constructor)
  - Anotación SkeakyThrows ()
  - Anotación Synchronized (Se podría decir que sustituye al synchronized de java)
  - Anotación log
    - commonsLog  
    - JbossLog
    - Log4j
    - Log 
    - Slf4j
    - Xslf4j
  - Configuración de Lombok
