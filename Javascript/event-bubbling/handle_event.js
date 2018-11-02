// const div = document.querySelector('.one');

// function logText(e) {
//     console.log(e.target.classList.value);
// }

// div.addEventListener('click', logText);

const divs = document.querySelectorAll('div');
const button = document.querySelector('button');

function logText(e) {
    console.log(this.classList);
    // e.stopPropagation(); // stop bubbling!
    // console.log(this);
}

divs.forEach(div => div.addEventListener('click', logText));