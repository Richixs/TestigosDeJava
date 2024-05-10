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