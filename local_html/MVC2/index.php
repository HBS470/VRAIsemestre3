<?php

require_once "connexion.php";
require_once "site.php";

Connexion::initConnexion();
$site = new Site();
$site->exec_module();



