const canvas = document.querySelector('#draw');
const context = canvas.getContext('2d');

// Resize our canvas width and height to be the same as the browser window
canvas.width = window.innerWidth;
canvas.height = window.innerHeight;

// drawing style
context.strokeStyle = '#BADA55';
context.lineJoin = 'round';
context.lineCap = 'round';