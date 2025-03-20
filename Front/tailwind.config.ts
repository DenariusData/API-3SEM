import type { Config } from 'tailwindcss'
import defaultTheme from 'tailwindcss/defaultTheme'
import Default from './layouts/default.vue'

export default <Partial<Config>>{
    theme: {
        extend: {
            colors: {
                primary: {
                    DEFAULT: '#007ec7',
                }
            }
        }
    }
}
