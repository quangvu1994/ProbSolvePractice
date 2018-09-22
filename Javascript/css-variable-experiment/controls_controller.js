function apply_controls_input(e) {
    // only listen to input element
    if (e.target.tagName == "INPUT") {
        const suffix = e.target.dataset.sizing || "";
        document.documentElement.style.setProperty(`--${e.target.name}`, e.target.value + suffix);
    }
    // stop bubbling event
    e.stopPropagation();
}

// listen to controls' input changes event
const controls = document.querySelector(".controls")
controls.addEventListener("change", apply_controls_input);
controls.addEventListener("mousemove", apply_controls_input);