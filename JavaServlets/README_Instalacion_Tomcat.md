# Instalación de Apache Tomcat 9 en macOS

Instalar y ejecutar Apache Tomcat 9 manualmente en macOS, ideal para proyectos Java con Servlets.

---

## Requisitos

- macOS actualizado
- Java JDK 11 o superior (usa `java -version` para verificar)

---

## Paso 1: Descargar Apache Tomcat

1. Ve a la página oficial:  
    https://tomcat.apache.org/download-90.cgi

2. Descarga la versión **Core** en formato `.tar.gz` (ejemplo: `apache-tomcat-9.0.XX.tar.gz`)

3. Coloca el archivo en tu carpeta de usuario (`~/`)

---

## Paso 2: Extraer y mover

```bash
tar -zxf apache-tomcat-9.0.XX.tar.gz -C ~/
mv ~/apache-tomcat-9.0.XX ~/apache-tomcat-9
```

> Esto dejará Tomcat en: `~/apache-tomcat-9`

---

## Paso 3: Iniciar y detener Tomcat

### Iniciar el servidor:

```bash
~/apache-tomcat-9/bin/startup.sh
```

### Detener el servidor:

```bash
~/apache-tomcat-9/bin/shutdown.sh
```

---

## Paso 4: Acceder desde navegador

Una vez iniciado Tomcat, abre:

```
http://localhost:8080
```

Deberías ver la página de bienvenida de Tomcat.

---

## Paso 5: Verificar Logs (opcional)

Para ver si tu WAR fue desplegado correctamente:

```bash
tail -f ~/apache-tomcat-9/logs/catalina.out
```

---

## Paso 6: Eliminar WAR desplegados (opcional)

Para eliminar una app:

```bash
rm -rf ~/apache-tomcat-9/webapps/Calculator*
```

---

**Autor:** Sebastián Yepes  
**Licencia:** MIT
