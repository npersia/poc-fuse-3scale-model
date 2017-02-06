# Modelo Compartido

Este repositorio tiene el modelo que se utiliza para la _poc_.

## Deplegar en NEXUS

```
$ mvn clean deploy
```

Recordar tener configurado un servidor con el id `nexus-ose-3rdparty`:

```
  <servers>
    <server>
      <username>admin</username>
      <password>admin123</password>
      <id>nexus-ose-3rdparty</id>
    </server>
  </servers>
```
