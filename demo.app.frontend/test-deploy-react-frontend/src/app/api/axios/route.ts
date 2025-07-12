'use server'
import axios from 'axios'

async function fetchPosts(): Promise<string> {
  const response = await axios.get(
    'https://demodeployspringbootbackend.onrender.com/test/dani'
  )
  return response.data
}
export { fetchPosts }
