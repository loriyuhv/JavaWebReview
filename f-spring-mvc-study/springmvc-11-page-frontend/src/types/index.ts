export interface Book {
  id?: number
  type: string
  name: string
  description?: string
}

export interface BookForm {
  type: string
  name: string
  description?: string
}
