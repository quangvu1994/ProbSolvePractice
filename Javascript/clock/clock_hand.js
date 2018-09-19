function setDate() {
    const now = new Date();
    const seconds = now.getSeconds();
    const minutes = now.getMinutes();
    const hours = now.getHours();
    // get the second hand degree
    const secondsDeg = ((seconds/60) * 360) + 90;
    // get the minute hand degree
    const minutesDeg = ((minutes/60) * 360) + 90;
    // get the hour hand degree
    const hoursDeg = ((hours/24) * 360) + 90;

    const secondHand = document.querySelector(".second-hand");
    secondHand.style.transform = `rotate(${secondsDeg}deg)`;

    const minuteHand = document.querySelector(".min-hand");
    minuteHand.style.transform = `rotate(${minutesDeg}deg)`;

    const hourHand = document.querySelector(".hour-hand");
    hourHand.style.transform = `rotate(${hoursDeg}deg)`;

}

// run the function every second
setInterval(setDate, 1000);