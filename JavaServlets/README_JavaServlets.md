# Java Servlet Calculator

Este proyecto es una calculadora web simple implementada con Servlets en Java y desplegada en Apache Tomcat 9.

---

## Requisitos

- Java JDK 11 o superior (se probó con JDK 21)
- Apache Tomcat 9 descargado manualmente
- Visual Studio Code (opcional, pero recomendado)

---

## Estructura del Proyecto

```
JavaServlets/
├── Calculator/
│   ├── index.html
│   └── WEB-INF/
│       └── classes/
│           └── CalculatorServlet.class
├── Calculator.war
├── build/
│   └── CalculatorServlet.class
├── src/
│   └── CalculatorServlet.java
├── webapp/
│   └── index.html
```

---

## Pasos para compilar y ejecutar

### 1. Compilar el Servlet

Desde la raíz del proyecto:

```bash
javac -cp "$HOME/apache-tomcat-9/lib/servlet-api.jar" -d build src/CalculatorServlet.java
```

> Esto genera `CalculatorServlet.class` en la carpeta `build/`.

---

### 2. Crear estructura para WAR

```bash
mkdir -p Calculator/WEB-INF/classes
cp build/CalculatorServlet.class Calculator/WEB-INF/classes/
cp webapp/index.html Calculator/
```

---

### 3. Crear el archivo `.war`

```bash
jar -cvf Calculator.war -C Calculator .
```

> Esto genera `Calculator.war` listo para desplegar.

---

### 4. Desplegar en Tomcat

```bash
cp Calculator.war ~/apache-tomcat-9/webapps/
```

---

### 5. Iniciar Tomcat

```bash
~/apache-tomcat-9/bin/startup.sh
```

Si ya está corriendo y deseas reiniciar:

```bash
~/apache-tomcat-9/bin/shutdown.sh
~/apache-tomcat-9/bin/startup.sh
```

---

### 6. Verificar en el navegador

Abre en tu navegador:

```
http://localhost:8080/Calculator/index.html
```

---

## ¿Errores?

- Asegúrate de que `servlet-api.jar` está en la ruta correcta.
- Revisa el despliegue con:

```bash
ls ~/apache-tomcat-9/webapps/
```

- Revisa los logs en caso de error:

```bash
tail -f ~/apache-tomcat-9/logs/catalina.out
```

---

**Autor:** Sebastián Yepes  
**Licencia:** MIT
