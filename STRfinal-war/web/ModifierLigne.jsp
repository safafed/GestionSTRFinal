<%-- 
    Document   : ModifierLigne
    Created on : 17 mars 2016, 11:33:50
    Author     : safa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class='no-js' lang='en'>
    <head>
        <meta charset='utf-8'>
        <meta content='IE=edge,chrome=1' http-equiv='X-UA-Compatible'>
        <title>Dashboard</title>
        <meta content='lab2023' name='author'>
        <meta content='' name='description'>
        <meta content='' name='keywords'>
        <link href="./assets/css/application-a07755f5.css" rel="stylesheet" type="text/css" />
        <link href="//netdna.bootstrapcdn.com/font-awesome/3.2.0/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.10.0/css/bootstrap-select.min.css">

    </head>
    <body class='main page'>
        <!-- Navbar -->
        <div class='navbar navbar-default' id='navbar'>
            <a class='navbar-brand' href='#'>
                <div class='image'></div>
                <image src="./assets/images/logomsara7.png"></image>
            </a>
            <ul class='nav navbar-nav pull-right'>
                <li class='dropdown'>
                    <a class='dropdown-toggle' data-toggle='dropdown' href='#'>
                        <i class='icon-envelope'></i>
                        Messages
                        <span class='badge'>5</span>
                        <b class='caret'></b>
                    </a>
                    <ul class='dropdown-menu'>
                        <li>
                            <a href='#'>New message</a>
                        </li>
                        <li>
                            <a href='#'>Inbox</a>
                        </li>
                        <li>
                            <a href='#'>Out box</a>
                        </li>
                        <li>
                            <a href='#'>Trash</a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href='#'>
                        <i class='icon-cog'></i>
                        Settings
                    </a>
                </li>
                <li class='dropdown user'>
                    <a class='dropdown-toggle' data-toggle='dropdown' href='#'>
                        <i class='icon-user'></i>
                        <strong>Safa FEDERER</strong>
                        <img class="img-rounded" src="http://placehold.it/20x20/ccc/777" />
                        <b class='caret'></b>
                    </a>
                    <ul class='dropdown-menu'>
                        <li>
                            <a href='#'>Edit Profile</a>
                        </li>
                        <li class='divider'></li>
                        <li>
                            <a href="/">Sign out</a>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>
        <div id='wrapper'>
            <!-- Sidebar -->
            <section id='sidebar'>
                <i class='icon-align-justify icon-large' id='toggle'></i>
                <ul id='dock'>
                    <li class='launcher'>
                        <i class='icon-dashboard'></i>
                        <a href="dashboard.jsp">Dashboard</a>
                    </li>
                    <li class='active launcher dropdown hover'>
                        <i class='icon-road'></i>
                        <a href="#">Ligne</a>
                        <ul class='dropdown-menu'>
                            <li class='dropdown-header'>Gestion des lignes</li>
                            <li>
                                <a href='AjouterLigne.jsp'>Ajouter Ligne</a>
                            </li>
                            <li>
                                <a href='ModifierLigne.jsp'>Modifier Ligne</a>
                            </li>
                            <li>
                                <a href='SupprimerLigne.jsp'>Supprimer Ligne</a>
                            </li>
                        </ul>
                    </li>
                    <li class='launcher dropdown hover'>
                        <i class='icon-flag'></i>
                        <a href="#">Arrêt</a>
                        <ul class='dropdown-menu'>
                            <li class='dropdown-header'>Gestion des arrêts</li>
                            <li>
                                <a href='AjouterArret.jsp'>Ajouter Arrêt</a>
                            </li>
                            <li>
                                <a href='ModifierArret.jsp'>Modifier Arrêt</a>
                            </li>
                            <li>
                                <a href='SupprimerArret.jsp'>Supprimer Arrêt</a>
                            </li>
                        </ul>
                    </li>
                    <li class='launcher dropdown hover'>
                        <i class='icon-calendar'></i>
                        <a href='#'>Periodes</a>
                        <ul class='dropdown-menu'>
                            <li class='dropdown-header'>Gestion des périodes</li>
                            <li>
                                <a href='AjouterPeriode.jsp'>Ajouter Période</a>
                            </li>
                            <li>
                                <a href='ModifierPeriode.jsp'>Modifier Période</a>
                            </li>
                            <li>
                                <a href='SupprimerPeriode.jsp'>Supprimer Période</a>
                            </li>
                        </ul>
                    </li>
                    <li class='launcher dropdown hover'>
                        <i class='icon-time'></i>
                        <a href='#'>Horaires</a>
                        <ul class='dropdown-menu'>
                            <li class='dropdown-header'>Gestion des horaires</li>
                            <li>
                                <a href='AjouterHoraire.jsp'>Ajouter Horaires</a>
                            </li>
                            <li>
                                <a href='ModifierHoraire.jsp'>Modifier Horaires</a>
                            </li>
                            <li>
                                <a href='SupprimerHoraire.jsp'>Supprimer Horaires</a>
                            </li>
                        </ul>
                    </li>
                    <li class='launcher dropdown hover'>
                        <i class='icon-warning-sign'></i>
                        <a href='#'>Info-Trafic</a>
                        <ul class='dropdown-menu'>
                            <li class='dropdown-header'>Gestion du trafic</li>
                            <li>
                                <a href='AjouterInfoTrafic.jsp'>Ajouter info-trafic</a>
                            </li>
                            <li>
                                <a href='ModifierInfoTrafic.jsp'>Modifier info-trafic</a>
                            </li>
                            <li>
                                <a href='SupprimerInfoTrafic.jsp'>Supprimer info-trafic</a>
                            </li>
                        </ul>
                </ul>
                <div data-toggle='tooltip' id='beaker' title='Made by lab2023'></div>
            </section>
            <!-- Tools -->
            <section id='tools'>
                <ul class='breadcrumb' id='breadcrumb'>
                    <li class='title'> Ligne / Gestion des lignes</li>
                </ul>

            </section>
            <!-- Content -->
            <div id='content'>
                <div class='panel panel-default'>
                    <div class='panel-heading'>
                        <i class='icon-road icon-large'></i>
                        Modifier une ligne

                    </div>
                    <div class='panel-body'>
                     

                      <div class='form-group'>  
                      <label class='col-lg-2 control-label'>Choisir la ligne à modifier</label>  
                       
                            <select class="selectpicker" data-show-subtext="true" data-live-search="true">
                                <option data-subtext="Rep California">Tom Foolery</option>
                                <option data-subtext="Sen California">Bill Gordon</option>
                                <option data-subtext="Sen Massacusetts">Elizabeth Warren</option>
                                <option data-subtext="Rep Alabama">Mario Flores</option>
                                <option data-subtext="Rep Alaska">Don Young</option>
                                <option data-subtext="Rep California" disabled="disabled">Marvin Martinez</option>
                            </select>

                       <button class='btn btn-safa' type='submit' >Charger les données</button>
                      </div>
                         <form class='form-horizontal'> 
                       <fieldset>
                        <legend>Formulaire de modification d'une ligne</legend>
                                 <div class='form-group'>
                                    <label class='col-lg-2 control-label'>Code de la ligne</label>
                                    <div class='col-lg-10'>
                                        <input class='form-control' placeholder='code ligne' type='text'>
                                    </div>
                                </div>
                                <div class='form-group'>
                                    <label class='col-lg-2 control-label'>Tarif 5 premiers arrêts</label>
                                    <div class='col-lg-10'>
                                        <input class='form-control' placeholder='Tarif 1' type='text'>
                                    </div>
                                </div>
                                <div class='form-group'>
                                    <label class='col-lg-2 control-label'>Tarif 3 seconds arrêts</label>
                                    <div class='col-lg-10'>
                                        <input class='form-control' placeholder='Tarif 2' type='text'>
                                    </div>
                                </div>
                                <div class='form-group'>
                                    <label class='col-lg-2 control-label'>Tarif à partir du 9 ème arrêt</label>
                                    <div class='col-lg-10'>
                                        <input class='form-control' placeholder='Tarif 3' type='text'>
                                    </div>
                                </div>
                        <div class='form-inline' >
                                    <button class='btn btn-primary' type='submit' >Modifier</button>
                                    <a class='btn btn-primary' href='dashboard.jsp' >Annuler</a>
                                </div>
                    </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Footer -->
        <!-- Javascripts -->
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js" type="text/javascript">

</script><script src="//ajax.googleapis.com/ajax/libs/jqueryui/1.10.3/jquery-ui.min.js" type="text/javascript">

</script><script src="//cdnjs.cloudflare.com/ajax/libs/modernizr/2.6.2/modernizr.min.js" type="text/javascript">

</script><script src="./assets/js/application-985b892b.js" type="text/javascript"></script>
<!--<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>-->
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.10.0/js/bootstrap-select.min.js"></script>

    </body>
</html>


