import { execute, parse } from 'graphql'
import { schema } from './schema.js'

async function index() {
  const sampleQuery = parse( `
    query {
      hello
    }
  `)

  const response = await execute({
    schema,
    document: sampleQuery,
  })

  console.log(response)
}

index()
