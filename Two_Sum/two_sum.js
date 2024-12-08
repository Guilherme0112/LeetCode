
try {
    const nums = [1, 2, 3, 4];

    const indices = [2, 3]; 

    
    var n1 = nums[indices[0]];
    var n2 = nums[indices[1]];

    if(isNaN(n1) || isNaN(n2)){
        throw new Error("As chaves estão vazias");
    }

    console.log(n1 + n2);

} catch (error) {
    console.error("Erro: ", error.message);
}
