<?php

    // Require Soap
    require_once('../lib/nusoap.php');

    //Create Client & set WSDL file path
    $client = new nusoap_client("http://localhost:8080/bankWS?wsdl", 'wsdl');

    // Check for any error(s)
    $err = $client->getError();
    if ($err) {
        echo '<h2>Constructor error</h2><pre>'.$err.'</pre>';
        exit();
    }

    // service call
    $result = $client->call('getComptes');

    // result set returned
    echo "<pre>";
    print_r($result);
    echo "</pre>";
