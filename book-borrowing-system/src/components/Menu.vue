<template>
    <div id = "menu">
        <h1>Borrow Books
            <router-link to='/booklist'>
                <button>Go To</button>
            </router-link>
        </h1>
        <h1>Return Books
            <router-link to='/onloanbooklist'>
                <button>Go To</button>
            </router-link>
        </h1>
        <router-link to='/'>
            <button>Logout</button>
        </router-link>
    </div>
</template>

<script>
export default {
  name: 'menu'
}
</script>
