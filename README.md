# TestigosDeJava

## Miembros:

- Nestor Ramirez Caero
- Ricardo Ramirez Caero
- Sebastian Barrera Vargas

## 1. Flujo de trabajo:

#### GitHub Flow

![GitHubFlow:https://blog.programster.org/git-workflows](./imagenes/github-flow.png "GitHub Flow")

> Programster's Blog: https://blog.programster.org/git-workflows

Este flujo de trabajo es ideal para quienes buscan simplicidad e implementación frecuente, ya sea una corrección de errores o una característica, se realiza a través de una rama que se crea desde la rama principal. Una vez completado el trabajo en la rama, se revisa y prueba antes de fusionarlo con la rama principal mediante una "pull request".

#### Creación de Ramas

Crear ramas en un repositorio nos brinda un espacio separado para <u>trabajar sin afectar la rama principal</u>. Esto nos permite hacer commits de manera segura para respaldar nuestro trabajo en el repositorio remoto.

Para crear una rama podemos usar los siguientes comandos:

```bash
git branch <"nombre-de-la-rama">
```

```bash
git switch -c <"nombre-de-la-rama">
```

```bash
git checkout -b <"nombre-de-la-rama">
```

Recuerda utilizar nombres de rama cortos y descriptivos. Esto permite que tus colaboradores puedan entender rápidamente el propósito de cada rama al ver el repositorio.

#### Integración de Cambios
Una vez que los cambios en una rama están completos y se han probado localmente, se envía una Pull Request desde esa rama a la rama principal. Nuestro repositorio está configurado para requerir que al menos un colaborador apruebe la solicitud antes de que pueda fusionarse con la rama principal. Además, se verifica que no haya pendientes asociados con la solicitud antes de proceder con la fusión.

##  2. Buenas prácticas en Git:

* Usar verbo en imperativo para los commits: Trata de no hablar en pasado, tipo no digas se añadio, se modifico. En cambio usa palabras como Añade, Modifica, etc.
* Usa prefijos en los commits: 

    * `feat:` Para nuevas caracteristicas.
    * `fix:` Arregla un bug.
    * `perf:` Cambios que mejoran el rendimiento.
    * `build:` Cambios en el sistema de build, tareas de despliegue o instalacion.
    * `ci:` Cambios para la integracion continua.
    * `docs:` Cambios para la documentacion.
    * `refactor:` Refactorización del codigo, lo usaremos para arreglar "bad smells" o malas practicas.
    * `style:` Cambios en el formato.
    * `test:` Añade tests o modifica los que hay.
*  Se debe sincronizar los cambios con el repositorio remoto de manera continua debido a que esto garantiza que tu trabajo estara respaldado y seguro. 
* Crear nombres de ramas que especifiquen que hacen por ejemplo `feature/ordenamiento`.
* Usar como maximo 50 caracteres para el mensaje de commit.

## 3. Bitacora

Nuestro equipo logró desarrollar una calculadora en Java capaz de funcionar con cualquier sistema numérico. Este proyecto fue llevado a cabo utilizando el GitFlow de GitHub, lo que nos permitió implementar cambios de manera efectiva en la rama principal del repositorio. Aunque no estuvo exento de desafíos, como era de esperar en un proyecto colaborativo, nos enfrentamos a algunos conflictos durante el proceso. En particular, surgieron discrepancias cuando dos miembros del equipo, Ricardo y Sebas, trabajaban simultáneamente en una clase, cada uno en un método diferente. Sin embargo, gracias a una comunicación abierta y a una rápida resolución.

## Git Hooks/Git Actions que usamos como equipo.
En este trabajo usamos 2 hooks entre los cuales 1 es de servidor y 1 era local, a continuacion mostraremos un poco de que iban:

### Hook Local

Este hook lo que hace es evitar que hagamos commits sin un prefijo aunque se llego a implementar un poco tarde en el desarrollo.

```bash
#!/bin/sh

# Captura el mensaje del commit
commit_message=$(cat "$1")

# Define los prefijos que deseas que tenga cada commit
prefixes=("feat:" "docs:" "fix:" "style:" "chore:" "perf:" "build:" "ci:" "refactor:" "test:")

# Verifica si el mensaje del commit comienza con alguno de los prefijos
for prefix in "${prefixes[@]}"; do
  if [[ $commit_message == $prefix* ]]; then
    # Si el mensaje del commit comienza con alguno de los prefijos, permite que el commit continúe
    exit 0
  fi
done

# Si el mensaje del commit no comienza con ninguno de los prefijos, muestra un error y evita que se realice el commit
echo "ERROR: El mensaje del commit debe comenzar con uno de los siguientes prefijos: ${prefixes[*]}"
exit 1
```

### Hook Remoto

El Hook remoto que usamos sirve para autoasignar etiquetas a nuestros Pull Requests, es parte de la función Git Hub Actions de Git Hub. Eh aqui la imagen de su icono:

<p align="center">
  <img src="https://github.com/Richixs/TestigosDeJava/blob/main/imagenes/GitHubAction1.png" alt="Imagen Hook Remoto" width="500">
</p>

## Buenas y malas practicas de los integrantes

### 1. Sebastian evaluara a Ricardo

* #### Buenas practicas

Entre las buenas practicas que pude ver en Ricardo es el uso de prefijos para los commits y el respeto al flujo de trabajo que usamos, tambien me parecio que hubo muy buena comunicación a la hora de trabajar. Me parecio que la frecuencia de sus commits fue la adecuada.

* #### Malas practicas

Note una mala practica en Ricardo y es que hizo algunos commits con ramas sin prefijos y en algunas no se escribio una forma de describir el proposito de la rama.

### 2. Ricardo evaluara a Nestor

* #### Buenas practicas

En cuanto a las buenas prácticas, Nestor ha demostrado entendimiento de las metodologías de desarrollo y ha seguido consistentemente las prácticas recomendadas. Ha mantenido un nivel de calidad en su trabajo.

* #### Malas practicas

 En términos de áreas de mejora, Nestor necesita enfocarse en revisar las solicitudes de extracción (PR).

 ### 3. Nestor evaluara a Sebas

* #### Buenas practicas

En lo que respecta a las buenas prácticas, Sebas se ha destacado con la calidad del trabajo y el cumplimiento de los estándares establecidos. Ha sido consistente en seguir las mejores prácticas de desarrollo, incluido el uso de prefijos para los commits y el respeto al flujo de trabajo del equipo.

* #### Malas practicas

 Sebas cometió un error al utilizar una rama antigua en un momento determinado. Aunque este incidente no tuvo repercusiones graves.