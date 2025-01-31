import React from 'react'
import Overview from './Overview'
const MainContainer = () => {

    const items = ['Flex item 1', 'Flex item2','Flex item 3', 'Flex item 4','Flex item 5', 'Flex item 6','Flex item 3', 'Flex item 4','Flex item 5', 'Flex item 6']

  return (
    <div class='d-flex mt-4 flex-wrap justify-content-center'>
        { items.map((item, index) => (
            <Overview/>
        ))}
    </div>
  )
}

export default MainContainer
