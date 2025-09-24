# Sistema Administrativo en Java

Un completo sistema de escritorio para la administración de facturación e inventario, desarrollado en Java con una interfaz gráfica intuitiva y conexión a base de datos.


<img src="https://imgur.com/2FcDIy4.png" width="400"/> <img src="https://imgur.com/8hLBF08.png" width="400"/>

## ✨ Características Principales

*   **Gestión de Inventario:** Control total sobre productos, categorías y proveedores.
*   **Facturación:** Creación y gestión de facturas de venta de forma sencilla.
*   **Gestión de Clientes:** Administra la información de tus clientes.
*   **Reportes:** Genera reportes de ventas, inventario y más.
*   **Copia de Seguridad:** Funcionalidad para crear y restaurar copias de seguridad de la base de datos.

---

## 📋 Requisitos

Para poder ejecutar el sistema, necesitarás tener instalado el siguiente software en tu equipo:

*   **Java Development Kit (JDK) o Java Runtime Environment (JRE):** Versión 21 o superior.
    *   Puedes descargarlo desde [Adoptium (Eclipse Temurin)](https://adoptium.net/es/).
*   **Sistema de Gestión de Base de Datos:** MariaDB o MySQL.
    *   **MariaDB:** Puedes descargarlo desde su [sitio web oficial](https://mariadb.org/download/).
    *   **MySQL:** Puedes descargarlo desde su [sitio web oficial](https://dev.mysql.com/downloads/mysql/).

---

## 🚀 Instalación

Sigue estos pasos para configurar el entorno y ejecutar el programa.

### 1. Instalación de Java

1.  Descarga e instala la versión recomendada de Java (JDK o JRE).
2.  Asegúrate de que Java esté añadido al `PATH` de las variables de entorno de tu sistema. Puedes verificarlo abriendo una terminal y ejecutando el comando:
    ```sh
    java -version
    ```

### 2. Instalación de la Base de Datos (MariaDB/MySQL)

1.  Descarga e instala MariaDB o MySQL.
2.  Durante la instalación, se te pedirá configurar un usuario `root`. Para una configuración rápida y compatible con el sistema, puedes usar:
    *   **Usuario:** `root`
    *   **Contraseña:** `1234`
3.  Asegúrate de que el servicio de la base de datos se esté ejecutando. En Windows, puedes iniciarlo con el comando:
    ```sh
    net start MariaDB
    ```
    O el servicio correspondiente a MySQL si usas ese gestor.
4.  Añade la ruta del directorio `bin` de tu base de datos al `PATH` del sistema. **Esto es crucial para que el programa pueda encontrar las herramientas de la base de datos y configurar todo automáticamente en el primer inicio.**
    *   Ve a `Equipo` > `Configuración avanzada del sistema` > `Variables de entorno`.
    *   En `Variables del sistema`, busca y edita la variable `Path`.
    *   Añade la ruta al directorio `bin`. Por ejemplo:
        ```
        C:\Program Files\MariaDB 11.5\bin
        ```
    *   Guarda los cambios.

 <img src="https://imgur.com/hvVoPkI.png" width="400"/>
 <img src="https://imgur.com/XQDx1P8.png" width="400"/>
 <img src="https://imgur.com/G14nYfv.png" width="400"/>
 <img src="https://imgur.com/TqPifWA.png" width="400"/>

## ▶️ Ejecución

Una vez que hayas instalado Java y configurado la base de datos, simplemente haz doble clic en el archivo `SistemaAdministrativo.jar` que se encuentra en la raíz del proyecto para iniciar la aplicación.

**Nota Importante:** La primera vez que ejecutes el programa, este se encargará de crear e importar la base de datos `sistema_compraventa` de forma automática. Solo necesitas asegurarte de que el servicio de MariaDB/MySQL esté activo.

¡Y listo! Ya puedes empezar a usar el sistema.

<img src="https://i.imgur.com/BHhovZ5.png" width="340"/>

## 📖 Manual de Usuario

A continuación se detallan las funciones de los principales módulos del sistema.

### Menú Principal

<img src="https://imgur.com/2FcDIy4.png" width="600"/>

*   **Punto de Venta:** Gestión de ventas diarias, cobros y generación de tickets.
*   **Productos:** Administración del catálogo de productos, incluyendo precios, stock y descripciones.
*   **Inventario:** Control del stock de los productos en almacén.
*   **Registro:** Registro de transacciones o eventos dentro del sistema.
*   **Reportes:** Generación de informes y estadísticas sobre ventas, inventario o clientes.
*   **Configuración:** Personalización del sistema.
*   **Pie de página:** Muestra información del usuario conectado y la fecha/hora de acceso.

---

### Punto de Venta

<img src="https://imgur.com/8hLBF08.png" width="600"/>

*   **Encabezado:** Muestra el nombre del negocio, ubicación y fecha/hora de la transacción.
*   **Información del cliente:** Campos para ingresar el nombre o código del cliente.
*   **Productos:** Detalle de los productos que se están comprando (código, descripción, cantidad, precio, etc.).
*   **Totales:** Resumen de la venta con subtotal, impuestos y total a pagar.
*   **Botones de acción:**
    *   `Salir`: Cierra el programa.
    *   `Tasa`: Selecciona la tasa para conversión de divisas.
    *   `Clientes`: Busca o agrega un cliente.
    *   `Eliminar`: Quita el último producto agregado.
    *   `Eliminar Todo`: Vacía el carrito de compra.
    *   `Totalizar`: Finaliza la venta y genera el ticket/factura.

---

### Productos

<img src="https://imgur.com/5Sl8yPP.png" width="600"/>

*   **Lista de Productos:** Muestra una tabla con ID, código, nombre, cantidad, precio, descripción, IVA y categoría.
*   **Categorías:** Permite gestionar las categorías de los productos.
*   **Añadir Producto:** Agrega nuevos productos al inventario.
*   **Botones de acción:**
    *   `Buscar`: Filtra los productos por diferentes criterios.
    *   `Editar`: Modifica la información de un producto existente.
    *   `Eliminar`: Borra un producto del inventario.

---

### Inventario

<img src="https://imgur.com/4o2jPF1.png" width="600"/>

*   **Formulario de búsqueda:** Permite buscar información específica de un producto, proveedor y su stock actual.
*   **Tabla de inventario:** Muestra un registro de los movimientos de inventario para un producto específico (entradas y salidas).
*   **Botones de acción:**
    *   `Añadir`: Incrementa el stock de un producto.
    *   `Restar`: Disminuye el stock de un producto.

---

### Registro de Ventas

<img src="https://imgur.com/MOBoa1U.png" width="600"/>

*   **Tabla de datos:** Muestra un registro detallado de las ventas, incluyendo número de factura, cliente, producto, cantidad, totales (en Bs y $) y fecha.
*   **Campo de búsqueda:** Permite filtrar o buscar registros específicos.

---

### Reportes

<img src="https://imgur.com/ByJ7l3k.png" width="600"/>

*   **Tipos de Reporte:** Iconos para generar reportes de `Clientes`, `Proveedores`, `Productos`, `Ventas`, `Productos Vendidos` e `Inventario`.
*   **Filtro de Fechas:** Permite filtrar los reportes de ventas, productos vendidos e inventario por un rango de fechas específico.

### Configuración

<img src="https://imgur.com/jAlvKqH.png" width="600"/>

*   **Empresa:** Gestión de la información general de la empresa.
*   **Usuarios:** Administración de usuarios del sistema, asignando roles y permisos.
*   **Proveedores:** Gestión de la información de los proveedores.
*   **Clientes:** Gestión de la base de datos de clientes.
*   **Soporte:** Acceso a documentación o soporte técnico.
*   **Respaldo:** Realización de copias de seguridad de la base de datos.