const inbox = document.querySelector('.inbox');
const checkboxes = document.querySelectorAll("input[type='checkbox']");

let last_checked;
function handle_checkbox(e) {
    // only handle the event if the target is input/checkbox type
    if (e.target.tagName == 'INPUT') {
        if (!last_checked) {
            last_checked = e.target;
            return
        }
        let trigger_checking = false;
        if(e.shiftKey) {
            checkboxes.forEach(checkbox => {
                // don't want to check any other box if hold shift for one checkbox. 
                if (checkbox === last_checked && checkbox === e.target) {
                    return;
                }
                
                if (checkbox === last_checked || checkbox === e.target) {
                    trigger_checking = !trigger_checking;
                    last_checked.checked = e.target.checked;
                    return;
                }

                if (trigger_checking) {
                    checkbox.checked = e.target.checked;
                }
            });
        } 
        last_checked = e.target;
    }

    e.stopPropagation();
}
inbox.addEventListener('click', handle_checkbox);