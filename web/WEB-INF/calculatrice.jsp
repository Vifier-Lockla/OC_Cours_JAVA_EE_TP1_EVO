<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
	<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<!--  
        <link href="./css/calculatrice.css" rel="stylesheet">
-->
        <title>Caclulatrice</title>
		<style type="text/css">
		  <%@include file="./css/calculatrice.css" %>
		</style>
	</head>

	<body>
	   <div class="container">
            <div class="row">
                <div class="col-xs-12 col-sm-2 col-md-3 col-lg-3"></div>
                <div class="col-xs-12 col-sm-8 col-md-6 col-lg-6">
                    <h2>Cours OC - JAVA EE - TP1</h2>
                </div>
                <div class="col-xs-12 col-sm-2 col-md-3 col-lg-3"></div>
            </div>
            <!-- Menu déroulant depuis un bouton -->
            <div class="row">
                <div class="col-xs-12 col-sm-2 col-md-3 col-lg-3"></div>
                <div class="col-xs-12 col-sm-8 col-md-6 col-lg-6">
                    <div class="panel">
                        <div class="panel-heading">
                            <h4>Calculatrice</h4>
                        </div>
                        <div class="panel-body text-center">
                        
				            <form action="/OC_Cours_JAVA_EE_TP1/calculatrice" method="post">
				              <span class="champs">
				                <input class="fieldnb" type="number" name="number1" value="${ calcul.nombre1 }">
				                  <select name="operation" >
				                    <option value="+" ${ !calcul.operation.equals("+") ? "" : "selected" }>+</option>
				                    <option value="-" ${ !calcul.operation.equals("-") ? "" : "selected" }>-</option>
				                    <option value="x" ${ !calcul.operation.equals("x") ? "" : "selected" }>x</option>
				                    <option value="/" ${ !calcul.operation.equals("/") ? "" : "selected" }>/</option>
				                  </select> 
				                <input class="fieldnb" type="number" name="number2" value="${ calcul.nombre2 }">
				                <input class="btn btn-primary" type="submit" value="Calculer">
				              </span>
				            </form>
				            
                        </div>
                    </div>
                </div>
                <div class="col-xs-12 col-sm-2 col-md-3 col-lg-3"></div>
               </div>
               <div class="row">
                <div class="col-xs-12 col-sm-2 col-md-3 col-lg-3"></div>
                <div class="col-xs-12 col-sm-8 col-md-6 col-lg-6">
                    <div class="panel">
                        <div class="panel-heading">
                            <h4>Résultat de l'opération</h4>
                        </div>
                        <div class="panel-body text-center">
                            
                             <p>${ calcul.nombre1 } ${ calcul.operation } ${ calcul.nombre2 } = ${ calcul.resultat } </p>
                             <br />
                             <p class="pdivzero">${ erreur.equals("divzero") ? "Division par zéro impossible" : "" }</p>
                        </div>
                    </div>
                </div>
                <div class="col-xs-12 col-sm-2 col-md-3 col-lg-3"></div>
            </div>
            
		</div>
    </body>
</html>