<?php

try{
    $l1 = array_reverse([2, 4, 3]);
    $l2 = array_reverse([5, 6, 4]);
    
    $l1S = array_reduce($l1, function($carry, $item){
        return $carry . $item;
    }, "");
    $l2S = array_reduce($l2, function($carry, $item){
        return $carry . $item;
    }, "");
    
    
    echo $l2S + $l1S;
    
} catch (Exception $e){
    echo "Erro: ", $e;
}

// array_reduce transforma uma array em string

// Feito em
// 08/12/2024

?>