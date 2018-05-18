(function($) {
    $.fn.bootstrapValidator.i18n.sql = $.extend($.fn.bootstrapValidator.i18n.sql || {}, {
        'default': '请不要输入特殊字符'
    });

    $.fn.bootstrapValidator.validators.sql = {
        /**
         * Return true if the input value is a base 64 encoded string.
         *
         * @param {BootstrapValidator} validator The validator plugin instance
         * @param {jQuery} $field Field element
         * @param {Object} options Can consist of the following keys:
         * - message: The invalid message
         * @returns {Boolean}
         */
        validate: function(validator, $field, options) {
            var value = $field.val();
            if (value === '') {
                return true;
            }

            return !/^((?:')|(?:--)|(?:!)|(?:,)|\b(select)|update|union|and|or|delete|insert|trancate|char|into|substr|ascii|declare|exec|count|master|into|drop|execute)$/.test(value);
        }
    };
}(window.jQuery));
