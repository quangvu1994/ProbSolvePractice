const inbox = document.querySelector('.inbox');
const checkboxes = document.querySelectorAll("input[type='checkbox']");

let last_checked;
function handle_checkbox(e) {
    // only handle the event if the target is input/checkbox type
    if (e.target.tagName == 'INPUT') {
        let trigger_checking = false;

        if(e.target.checked && e.shiftKey) {
            checkboxes.forEach(checkbox => {
                if (checkbox === last_checked || checkbox === e.target) {
                    trigger_checking = !trigger_checking;
                }

                if (trigger_checking) {
                    checkbox.checked = true;
                }
            });
        }
        last_checked = e.target;
    }

    e.stopPropagation();
}
inbox.addEventListener('click', handle_checkbox);