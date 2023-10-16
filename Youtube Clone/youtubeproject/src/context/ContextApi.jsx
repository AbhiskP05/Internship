import React, {createContext, useState,useEffect} from "react"

import {fetchDataFromApi} from "./util/Api.jsx"

export const Context= createContext();

const AppContext =()=>{
    const [loading,setLoading]=useState(false)
    const [searchResults,setSearchResults]=useState(false)
    const [selectCategories,setselectCategories]=useState("New")
    const [mobileMenu,setmobileMenu]=useState(false)

    useEffect(()=>{
        fetchSelectedCategoryData(selectCategories)
    },[selectCategories]);

    const fetchSelectedCategoryData=(query)=>{
        setLoading(true)
        fetchDataFromApi(`search/?q=${query}`).then((res)=>{
            console.log(res)
            setSearchResults(res)
            setLoading(false)
        })
    }

    return(
        <ContextProvider value={{
            loading,
            setLoading,
            searchResults,
            setSearchResults,
            selectCategories,
            setselectCategories,
            mobileMenu,
            setmobileMenu,
        }}>

        </ContextProvider>
    )
}

export default AppContext