<template>
    <div id = "booklist">
        <p><router-link to='/menu'>
            <button>Back</button>
        </router-link></p>
        <table border="1">
            <thead>
                <th>Inventory ID</th>
                <th>ISBN</th>
                <th>Name</th>
                <th>Author</th>
                <th>Introduction</th>
                <th>Status</th>
                <th>Borrow</th>
            </thead>
            <tbody v-bind:key="index" v-for='(item, index) in bookList'>
                <td>{{ item.invID }}</td>
                <td>{{ item.ISBN }}</td>
                <td>{{ item.name }}</td>
                <td>{{ item.author }}</td>
                <td>{{ item.intro }}</td>
                <td>{{ item.bstatus }}</td>
                <td>
                  <p v-if="item.bstatus === 'Available'">
                    <button v-on:click="item.bstatus = 'On Loan'">Check Out</button>
                  </p>
                  <p v-else></p>
                </td>
            </tbody>
        </table>
    </div>
</template>

<script>
export default {
  name: 'booklist',
  data () {
    return {
      count: 1,
      bookList: [
        {invID: 0, ISBN: '9781982181284', name: 'Elon Musk', author: 'Walter Isaacson', intro: 'Empty', bstatus: 'Available'}
      ]
    }
  },
  method: {
    borrowBook: function () {
      this.count += 1
    }
  }
}
</script>
