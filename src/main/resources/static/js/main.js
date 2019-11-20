function postData(url, data) {
    return fetch(url, {
        body: JSON.stringify(data),
        cache: "no-cache",
        credentials: "same-origin",
        headers: {
            "user-agent": "Mozilla/4.0 MDN Example",
            "content-type": "application/json"
        },
        method: "POST",
        mode: "same-origin",
        redirect: "follow",
        referrer: "no-referrer"
    }).then(reponse => response.json());
}

function getData(url, data) {
    // Default options are marked with *
    return fetch(url, {
        cache: "no-cache", // *default, no-cache, reload, force-cache, only-if-cached
        credentials: "same-origin", // include, same-origin, *omit
        headers: {
            "user-agent": "Mozilla/4.0 MDN Example",
            "content-type": "application/json"
        },
        method: "GET", // *GET, POST, PUT, DELETE, etc.
        mode: "same-origin", // no-cors, cors, *same-origin
        redirect: "follow", // manual, *follow, error
        referrer: "no-referrer" // *client, no-referrer
    }).then(response => response.json()); // parses response to JSON
}

function updateCars(d) {
    let carDiv = document.getElementById("cars");
    carDiv.innerHTML = '';
    d.forEach(function(car) {
        carDiv.innerHTML += 'Year: ' + car.year + '<br>';
        carDiv.innerHTML += 'Make: ' + car.make + '<br>';
        carDiv.innerHTML += "Model: " + car.model + '<br>'
        carDiv.innerHTML += '<hr>';
    })

}

function createOptions(d) {
    let make = document.getElementById("make");
    d.forEach(function (m) {
        let o = document.createElement('option');
        o.value = m;
        o.innerText = m;
        make.appendChild(o)
    })
}

document.addEventListener("DOMContentLoaded", function() {
    let make = document.getElementById("make");

    let makes = getData('/auto/makes').then(data => createOptions(data));
    //<option value="Pontiac">Pontiac</option>
    //<option value="Ford">Ford</option>

    make.addEventListener("change", function() {
        let cars = getData('/auto/' + this.value).then(data => updateCars(data));;

    })
})