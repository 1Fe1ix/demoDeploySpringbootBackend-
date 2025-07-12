'use client'
import React, { useEffect, useState } from 'react'
import { Box, Typography } from '@mui/material'
import { fetchPosts } from '@/app/api/axios/route'

function App() {
  const [data, setData] = useState<string>('Lade...')

  useEffect(() => {
    const loadData = async () => {
      try {
        const result = await fetchPosts()
        setData(result)
      } catch (error) {
        console.error('Fehler beim Laden:', error)
        setData('Fehler beim Laden der Daten')
      }
    }

    loadData()
  }, [])
  return (
    <Box
      display='flex'
      justifyContent='center'
      alignItems='center'
      height='100vh'
    >
      <Typography variant='h3'> {data} </Typography>
    </Box>
  )
}

export default App
