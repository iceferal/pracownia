$(function(){
    $('.add').click(function(){
        $.ajax({
            contentType: 'application/json',
            url: "http://localhost:8080/motor",
            type: "Post",
            data: JSON.stringify({
                "producent": document.getElementById("producent").value,
                "model": document.getElementById("model").value,
                "symbol": document.getElementById("symbol").value,
                "pojemnosc": document.getElementById("pojemnosc").value,
            }),
            success: function(){
                alert("Dodano motor");
            },
            error: function () {
                alert("Błąd");
            }
        }).then(function (data) {
        });
    });
    $('.del').click(function () {
        $.ajax({
            url: "http://localhost:8080/motor/" + document.getElementById("deletion").value,
            type: 'DELETE',
            success: function () {
                if (!alert("Usunieto motor")) {
                    window.location.reload();
                }
            },
            error: function(){
                alert("Błąd");
            }
        }).then(function (data) {
        });
    });
});