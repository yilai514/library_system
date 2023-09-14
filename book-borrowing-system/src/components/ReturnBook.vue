<template>
    <div id = "onloanbooklist">
        <p><router-link to='/menu'>
            <button>Back</button>
        </router-link></p>
        <table border="1">
            <thead>
                <th>Inventory ID</th>
                <th>ISBN</th>
                <th>Name</th>
                <th>Borrowing Time</th>
                <th>Return Time</th>
            </thead>
            <tbody v-bind:key="index" v-for='(item, index) in bookList'>
                <td>{{ item.invID }}</td>
                <td>{{ item.ISBN }}</td>
                <td>{{ item.name }}</td>
                <td>{{ item.borrowTime }}</td>
                <td>
                  <p v-if="item.returnTime === ''">
                    <button v-on:click="item.returnTime = today">Return</button>
                  </p>
                  <p v-else>{{ item.returnTime }}</p>
                </td>
            </tbody>
        </table>
    </div>
</template>

<script>
import moment from 'moment'
export default {
  name: 'onloanbooklist',
  data () {
    return {
      today: moment(String(new Date())).format('YYYY/MM/DD'),
      bookList: [
        {invID: 0, ISBN: '9781982181284', name: 'Elon Musk', borrowTime: '2023/09/14', returnTime: ''}
      ]
    }
  },
  created () {},
  method: {}
}
</script>
