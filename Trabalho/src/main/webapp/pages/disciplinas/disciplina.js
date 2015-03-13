module = angular.module("Trabalho", []);

module.controller("ManterDisciplina", ["$scope","$http", ManterDisciplina]);


function DisciplinaController($scope,$http) {
    
    $scope.iniciar = funcaoIniciar;
    $scope.salvar = funcaoSalvar;
    $scope.excluir = funcaoExcluir;
    $scope.editar = funcaoEditar;
    
    $scope.disciplinas = [];
    $scope.disciplina = {};
    $scope.isNovo = true;
    
    function funcaoEditar(vitima) {
        $scope.disciplina = angular.copy(vitima);
        $scope.isNovo = false;
    }

    
    function funcaoExcluir(vitima) {
    }
    
    function funcaoSalvar() {
    }
    
    function funcaoCarregar() {
        $http.get("/disciplinas").success(onSuccess).error(onError);
        
        function onSuccess(data, status) {
            $scope.disciplinas = data;       
            console.log(data);
        }
        function onError(data, status) {
            alert("Deu erro: " + data);
        }
    }
    
    function funcaoIniciar() {
        funcaoCarregar();
        console.log(">>> veículos carregados....");
    }
        
}

