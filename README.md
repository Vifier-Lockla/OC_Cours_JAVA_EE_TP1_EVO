# Configuration

## intelliJ
La configuration est assez basique car nous n'utilisons pas Maven.
Pour plus de détails, se reporter aux copies d'écrans disponibles dans le répertoire doc/configuration_intelliJ.

![image facets](./doc/configuration_intellij/Structure_projet.png "Configuration IntelliJ : projet")
![image module source](./doc/configuration_intellij/Structure_module_source.png "Configuration IntelliJ : source")
![image module path](./doc/configuration_intellij/Structure_module_path.png "Configuration IntelliJ : path")
![image module dependencies](./doc/configuration_intellij/Structure_mdule_dependencies.png "Configuration IntelliJ : dependencies")
![image facets](./doc/configuration_intellij/Structure_facets.png "Configuration IntelliJ : Facets")
![image artifacts](./doc/configuration_intellij/Structure_artifacts.png "Configuration IntelliJ : Artifacts")


## Tomcat

La configuration de Tomcat sous IntelliJ : Se reporter aux copies d'écrans ci-dessous :

![image_config tomcat server](./doc/configuration_intellij/config_tomcat_server.png "Configuration IntelliJ Tomcat : server")
![image comfig tomcat deploy](./doc/configuration_intellij/config_tomcat_deploy.png "Configuration IntelliJ tomcat : deploy")


# Lancement de l'application

Le lancement de l'application sous IntelliJ est réalisé en cliquabt sur la flèche verte à droite de la liste de choix de l'application à lancer.

Le lancement de l'application directement de puis Tomcat nécessite d'avoir démarré Tomcat puis d'avoir déployé le fichier WAR dans le répertoire webapp/ de Tomcat.