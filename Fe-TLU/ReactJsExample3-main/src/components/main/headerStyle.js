import styled from 'styled-components';

export const Wrapper = styled.div`
    width: 100%;
    font-size: 23px;
    font-weight: bold;
    display: flex;
    flex-direction: row;
    justify-content: flex-start;
    align-items: center;
    background: #f8f8ff;
    flex-wrap: wrap;
    padding-top: 1em;
    padding-bottom: 1em;
`;

export const InputSearch = styled.input`
    font-size: 18px;
    margin-left: 2em;
    width: 24em;
    height: 2.8em;
    border-radius: 0.3em;
    box-sizing: border-box;
`;

export const ButtonGoto = styled.button`
    font-size: 18px;
    margin-left: 2em;
    width: 8em;
    height: 2.5em;
    border-radius: 0.3em;
    box-sizing: border-box;
    background: #f5fffa;
`;

export const Blank = styled.div`
    flex: 1;
`;

export const DropBox = styled.select`
    font-size: 18px;
    margin-right: 2em;
    width: 7em;
    height: 2.5em;
    border-radius: 0.3em;
    box-sizing: border-box;
    background: #f5fffa;
`;

