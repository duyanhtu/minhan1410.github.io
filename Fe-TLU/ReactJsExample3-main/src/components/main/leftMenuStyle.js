import styled from 'styled-components';

export const Wrapper = styled.div`
    width: 8em;
    height: 100vh;
    color: #6495ed;
    font-size: 23px;
    font-weight: bold;
    display: flex;
    justify-content: flex-start;
    align-items: center;
    flex-direction: column;
    background: #f8f8ff;
`;

export const Avata = styled.img`
    width: 7em;
    height: 7em;
    object-fit: cover;  
    margin-top: 1em;
    border-radius: 50%;
`;

export const TextField = styled.div`
    margin-top: 1em;
    width: 100%;
    padding-left: 1em;
    box-sizing: border-box;
    font-size: 0.7em;
    font-weight: 500;
`;


export const ButtonLogout = styled.button`
    width: 75%;
    height: 2em;
    width: 75%;
    height: 2em;
    margin-bottom: 0.5em;
    font-size: 1em;
    font-weight: bold;
    background: #f5fffa;
`;


export const Blank = styled.div`
    flex: 1;
`;

