<%@page import="java.net.URI"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html lang="fr">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-4.0.0.js"></script>

        <link rel="stylesheet"
              href="https://cdn.datatables.net/2.3.3/css/dataTables.dataTables.min.css">

        <title>Pilotage</title>

    </head>
    <body>
        <div class="container">
            <h1>Liste Mensuelle</h1>

            <form:form
                method="POST"
                modelAttribute="pilotageForm"
                id="pilotage"
                class="form-horizontal"
                name="pilotage"
                action="${flowExecutionUrl}&_eventId=listemensuelle&_csrf=${_csrf.token}">
                <div class="row">
                    <div class="col-md-6">
                        <label>Departement: </label>
                        <form:select id="departement" path="cdDepartement">
                            <form:option value="33">33</form:option>
                            <form:option value="44">44</form:option>
                            <form:option value="57">57</form:option>
                            <form:option value="75">75</form:option>
                            <form:option value="92">92</form:option>
                        </form:select>
                        <form:errors path="cdDepartement" />
                    </div>
                    <div class="col-md-6">
                        <label>Commune: </label>
                        <form:select id="commune" path="cdCommune">
                            <form:option value="002">002</form:option>
                            <form:option value="050">050</form:option>
                            <form:option value="33">403</form:option>
                            <form:option value="33">001</form:option>
                            <form:option value="33">004</form:option>
                        </form:select>
                        <form:errors path="cdCommune" />
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-6">
                        <label>Application: </label>
                        <form:select id="application" path="cdApplication">
                            <form:option value="surf">SURF</form:option>
                            <form:option value="gmbi">GMBI</form:option>
                            <form:option value="gestiontu">GESTION TU</form:option>
                            <form:option value="33">DINAR</form:option>
                            <form:option value="33">PLATAU</form:option>
                        </form:select>
                        <form:errors path="cdApplication" />
                    </div>
                    <div class="col-md-6">
                        <label>Requete: </label>
                        <form:select id="requete" path="cdRequete">
                            <form:option value="33">Declaration TF</form:option>
                            <form:option value="33">Declaration TU</form:option>
                            <form:option value="33">Declaration TF/TU</form:option>
                        </form:select>
                        <form:errors path="cdRequete" />
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-6">
                        <label>Email: </label>
                        <form:input id="email" path="cdEmail" />
                        <form:errors path="cdEmail" />

                        <button type="submit">Rechercher</button>
                    </div>
                    <div class="col-md-6"></div>
                </div>

                </form:form>


        </div>



        <div class="modal fade" id="loadingModal" tabindex="-1" aria-hidden="true" data-bs-backdrop="static" data-bs-keyboard="false">
            <div class="modal-dialog modal-dialog-centered">
                <div class="modal-content border-0 bg-transparent shadow-none">
                    <div class="modal-body text-center">
                        <div class="spinner-border text-primary" role="status" style="width: 3rem; height: 3rem;">
                            <span class="visually-hidden"> Chargement... </span>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <script>
            $(document).ready(function(){




            });
        </script>

        <script src="https://cdn.datatables.net/2.3.3/js/dataTables.min.js"></script>

        <!-- Option 1: Bootstrap Bundle with Popper -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    </body>
</html>
