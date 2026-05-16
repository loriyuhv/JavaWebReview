import axios from 'axios'
import type { Book } from '@/types'

export const getAllBooks = async () => {
  const res = await axios.get('/api/books')
  return res.data.data as Book[]
}

export const getBooksByName = async (name: string) => {
  const res = await axios.get(`/api/books/name/${name}`)
  return res.data.data as Book[]
}

export const addBook = async (book: Book) => {
  const res = await axios.post('/api/books', book)
  return res.data
}

export const updateBook = async (book: Book) => {
  const res = await axios.put('/api/books', book)
  return res.data
}

export const deleteBook = async (id: number) => {
  const res = await axios.delete(`/api/books/${id}`)
  return res.data
}
