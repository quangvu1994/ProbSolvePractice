const endpoint = 'https://gist.githubusercontent.com/Miserlou/c5cd8364bf9b2420bb29/raw/2bf258763cdddd704f8ffd3ea9a3e81d25e2c6f6/cities.json';

const cities = []
// fetch json data
fetch(endpoint).then(blob => blob.json()).then(data => cities.push(...data));

const suggestions = document.querySelector('.suggestions');
const searchBox = document.querySelector('.search');

/**
 * Get an array of cities that matched the search keyword
 * @param {*} keyword 
 */
function search(keyword) {
    return cities.filter(place => {
        // convert keyword var into regexp since match method takes regex
        const regex = new RegExp(keyword, 'gi');
        return place.city.match(regex) || place.state.match(regex);
    })
}

/**
 * Go through the result list > apply some css and display it
 */
function displaySearchResult() {
    const resultArr  = search(this.value);
    const html = resultArr.map(place => {
        // highlight the found keyword
        const regex = new RegExp(this.value, 'gi');
        const cityName = place.city.replace(regex, `<span class='hl'>${this.value}</span>`);
        const stateName = place.state.replace(regex, `<span class='hl'>${this.value}</span>`);
        return `
        <li>
            <span class='name'>${cityName}, ${stateName}</span>
            <span class='population'>${place.population}</span>
        </li>
        `
    }).join('');
    suggestions.innerHTML = html;
}

searchBox.addEventListener('keyup', displaySearchResult);
