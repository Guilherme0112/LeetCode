<?php

try{

    $indices = [1, 2];
    $nums = [1, 2, 3, 4];

    if(!isset($nums[$indices[0]]) || !isset($nums[$indices[1]])){
        throw new Exception("As chaves estão vazias");
    }

    $n1 = $nums[$indices[0]];
    $n2 = $nums[$indices[1]];

    echo $n1 + $n2;

} catch (Exception $e){
    echo "Erro: ", $e;
}

// Feito em:
// 08/12/2024